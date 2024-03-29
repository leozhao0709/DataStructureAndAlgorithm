const basicConfig = require('./jest.config.basic.js');

module.exports = {
  ...basicConfig,
  preset: 'ts-jest/presets/default-esm',
  globals: {
    'ts-jest': {
      // useESM: true,
    },
  },
  setupFilesAfterEnv: ['./jest.setup.ts'],
  testEnvironment: 'node',
  moduleNameMapper: {
    '\\.(jpg|jpeg|png|gif|eot|otf|webp|svg|ttf|woff|woff2|mp4|webm|wav|mp3|m4a|aac|oga)$':
      '<rootDir>/tests/__mocks__/fileMock.ts',
    [`^@app/(.*)`]: '<rootDir>/src/$1',
  },
};
