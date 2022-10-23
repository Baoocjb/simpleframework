package com.simplframework.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.simpleframework.util.ClassUtil;

import java.util.Set;

public class ClassUtilTest {

    @DisplayName("提取目标包名中的class文件")
    @Test
    public void testExtractPackageClass(){
        Set<Class<?>> classSet = ClassUtil.extractPackageClass("com.bao.entity");
        Assertions.assertEquals(4, classSet.size());
    }
}
