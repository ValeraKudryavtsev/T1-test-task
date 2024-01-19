package com.t1.test.service.impl;

import com.t1.test.service.ILineHandlerService;
import com.t1.test.util.CustomComparator;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LineHandlerServiceImpl implements ILineHandlerService {
    private final CustomComparator customComparator;

    public LineHandlerServiceImpl(CustomComparator customComparator) {
        this.customComparator = customComparator;
    }

    @Override
    public Map<Character, Integer> handleLine(String line) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : line.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return customComparator.sortMapByValueDescending(map);
    }
}
