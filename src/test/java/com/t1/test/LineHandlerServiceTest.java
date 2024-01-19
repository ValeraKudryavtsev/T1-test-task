package com.t1.test;

import com.t1.test.service.impl.LineHandlerServiceImpl;
import com.t1.test.util.CustomComparator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

@ExtendWith(MockitoExtension.class)
public class LineHandlerServiceTest {
    @Spy
    private CustomComparator customComparator;
    @InjectMocks
    private LineHandlerServiceImpl lineHandlerService;

    @Test
    public void when_handleLine_it_should_return_reverse_sorter_map() {
        Map<Character, Integer> sortedMap = new HashMap<>();
        sortedMap.put('b', 4);
        sortedMap.put('a', 3);
        sortedMap.put('c', 2);

        String line = "aaabbbbcc";

        Assertions.assertThat(sortedMap).isNotNull();
        Assertions.assertThat(sortedMap).isEqualTo(lineHandlerService.handleLine(line));
    }
}
