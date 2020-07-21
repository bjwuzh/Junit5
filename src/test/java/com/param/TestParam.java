package com.param;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestParam {
    @Test
    void assertion(){
        assertAll("demo assertions",
                ()-> assertEquals(1,1),
                ()-> assertEquals(2,2),
                ()-> assertEquals(5,5));

    }
    @Test
    void testGit(){
        System.out.println("提交到git上");
    }
}
