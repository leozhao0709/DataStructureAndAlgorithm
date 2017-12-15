package com.lzhao.interviewPrepare.linkedin.randomList;

import java.util.*;

/**
 * Created by lzhao on 12/1/17.
 */

class RandomList<T> {

    private ArrayList<T> arrayList;
    private Map<T, List<Integer>> map;

    public RandomList() {
        this.arrayList = new ArrayList<T>();
        this.map = new HashMap<T, List<Integer>>();
    }

    void add(T element) {
        this.arrayList.add(element);
        if (!map.containsKey(element)) {
            map.put(element, new LinkedList<Integer>());
        }
        map.get(element).add(this.arrayList.size()-1);
    }

    void remove(T element) {
        if (map.containsKey(element)) {
            List<Integer> indexList = this.map.get(element);
            int removeIndex = indexList.remove(indexList.size()-1);
            if (indexList.size() == 0) {
                this.map.remove(element);
            }

            T lastElement = this.arrayList.get(this.arrayList.size()-1);
            List<Integer> lastElementIndexList = this.map.get(lastElement);
            lastElementIndexList.set(lastElementIndexList.size()-1, removeIndex);
            Collections.sort(lastElementIndexList);
            this.map.put(lastElement, lastElementIndexList);

            Collections.swap(this.arrayList, removeIndex, this.arrayList.size()-1);


            this.arrayList.remove(this.arrayList.size()-1);
        } else {
            throw new RuntimeException("no " + element + " find!");
        }
    }

    int search(T element) {
        if (map.containsKey(element)) {
            List<Integer> indexList = this.map.get(element);
            return indexList.get(indexList.size()-1);
        }

        return -1;
    }

    T getRandom() {
        int randomIndex = (int) (Math.random() * this.arrayList.size());
        return this.arrayList.get(randomIndex);
    }
}
