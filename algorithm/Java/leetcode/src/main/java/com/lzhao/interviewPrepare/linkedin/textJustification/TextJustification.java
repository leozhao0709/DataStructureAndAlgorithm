package com.lzhao.interviewPrepare.linkedin.textJustification;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 12/4/17.
 */

class TextJustification {

    List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new LinkedList<String>();
        int wordsLength = 0;
        int start = 0;
        for (int i = 0; i < words.length; i++)
        {
            int checkLength = wordsLength + words[i].length() + (i - start);
            if (checkLength <= maxWidth)
            {
                wordsLength += words[i].length();
            } else
            {
                String line = this.createLine(words, start, i - 1, wordsLength, maxWidth, false);
                res.add(line);
                start = i;
                i--;
                wordsLength = 0;
            }
        }

        String lastLine = this.createLine(words, start, words.length - 1, wordsLength, maxWidth, true);
        res.add(lastLine);
        return res;
    }

    private String createLine(String[] words, int start, int end, int wordsLength, int maxWidth, boolean isLastLine) {
        if (start > end)
        {
            return null;
        }
        int n = end - start + 1;
        String res = words[start];
        if (isLastLine || n == 1)
        {
            for (int i = start + 1; i <= end; i++)
            {
                res += " ";
                res += words[i];
            }
            while (res.length() < maxWidth)
            {
                res += " ";
            }
        } else
        {
            int spaceNum = (maxWidth - wordsLength) / (n - 1);
            int extraSpace = (maxWidth - wordsLength) % (n - 1);
            for (int i = start + 1; i <= end; i++)
            {
                int spaceCount = 0;
                if (i - start <= extraSpace)
                {
                    while (spaceCount < spaceNum + 1)
                    {
                        res += " ";
                        spaceCount++;
                    }
                } else
                {
                    while (spaceCount < spaceNum)
                    {
                        res += " ";
                        spaceCount++;
                    }
                }
                res += words[i];
            }
        }

        return res;
    }
}
