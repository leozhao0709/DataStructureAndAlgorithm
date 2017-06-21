const gulp = require("gulp");
const del = require("del");
const gutil = require("gulp-util");
const notify = require("gulp-notify");
const plumber = require("gulp-plumber");
const fs = require("fs");
const path = require("path");
const watch = require("gulp-watch");
const ts = require('gulp-typescript');

gulp.task("default", [
    "modifyPublic",
    "typescriptBuild",
]);

const pipelog = notify.withReporter(() => {
    // console.log("Title:", options.title);
    // console.log("Message:", options.message);
    // callback();
});

// pipelog.logLevel(2);

const tsProject = ts.createProject('tsconfig.json');

const cleanFolder = (folderPath) => {
    try {
        var stats = fs.statSync(folderPath);
        del.sync(folderPath);
        gutil.log(gutil.colors.italic.red(`clean ${path.basename(folderPath)} `));
    } catch (err) {
        gutil.log(gutil.colors.italic.red(`${path.basename(folderPath)} not exists yet, no need to clean`));
    };
}

const buildAllTypeScript = () => {
    gulp.src("./ts/**/*.ts")
        .pipe(plumber())
        .pipe(pipelog("compile typescript file: <%= file.relative %>"))
        .pipe(
            tsProject()
        )
        .pipe(
            gulp.dest("./dist/js")
        )
        .pipe(pipelog({
            message: "all typescript files compile finish",
            onLast: true
        }));
}

gulp.task("buildTypeScriptFirstTime", () => {
    cleanFolder("./dist/js/");

    buildAllTypeScript();
})

gulp.task("typescriptBuild", ["buildTypeScriptFirstTime"], () => {
    watch(["./ts/**/*.ts"], (file) => {
        if (file.event === "unlink") {
            cleanFolder(`./dist/js/${path.dirname(file.relative)}/${path.basename(file.relative, "ts")}js`);
        }
        gutil.log(gutil.colors.italic.yellow(`recompiling all typescript now...`));
        buildAllTypeScript();
        gutil.log(gutil.colors.italic.yellow(`finish all typescript compile now...`));
    })
})

gulp.task("copyAllPublic", () => {
    cleanFolder("./dist/public");
    gulp.src(["./public/**"])
        .pipe(plumber())
        .pipe(pipelog("copy public static file: <%= file.relative %>"))
        .pipe(gulp.dest(`./dist/public`))
        .pipe(pipelog({
            message: "all public static files compile finish",
            onLast: true
        }))
})

gulp.task("modifyPublic", ["copyAllPublic"], () => {

    watch(["./public/**"], (file) => {
        if (file.event === "unlink") {
            cleanFolder(`./dist/public/${path.dirname(file.relative)}/${path.basename(file.relative)}`);
        } else {
            gulp.src(file.path)
                .pipe(plumber())
                .pipe(pipelog("modify public static file: <%= file.relative %>"))
                .pipe(gulp.dest(`./dist/public/${path.dirname(file.relative)}`))
                .pipe(pipelog({
                    message: "public static file modify finish: <%= file.relative %>",
                    onLast: true
                }));
        }
    })
})