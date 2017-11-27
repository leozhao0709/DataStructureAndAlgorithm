package com.lzhao.interviewPrepare.linkedin.repeatedDNA;

import java.util.*;

/**
 * Created by lzhao on 11/25/17.
 */

class DNAsequence {

    List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<String>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int encode = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (i < 9) {
                encode = encode << 2 | this.encode(s.charAt(i));
            } else {
                encode = (encode << 2 | this.encode(s.charAt(i))) & (1<<21-1);

                if (map.containsKey(encode)) {
                    if (map.get(encode) == 1) {
                        res.add(s.substring(i-9, i+1));
                    }
                    map.put(encode, 2);
                } else {
                    map.put(encode, 1);
                }
            }
        }

        return res;
    }
    
    private int encode(char c) {
        switch (c) {
            case 'A': return 0;
            case 'C': return 1;
            case 'G': return 2;
            case 'T': return 3;
            default: throw new RuntimeException("invalid string");
        }
    }
}
