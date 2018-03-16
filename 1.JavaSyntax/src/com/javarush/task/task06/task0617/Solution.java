package com.javarush.task.task06.task0617;

/* 
Блокнот для новых идей
*/

import com.sun.prism.shader.Solid_TextureRGB_AlphaTest_Loader;
// import com.sun.xml.internal.bind.v2.model.core.ID;

public class Solution {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    //напишите тут ваш код
    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }

    public static class Idea {

        public String getDescription() {
            return "Любой непустой текст";
        }
    }
}
