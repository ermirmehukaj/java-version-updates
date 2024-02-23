package cydeo.task;

import cydeo.task.Orange;

@FunctionalInterface
public interface OrangeFormater {

    String accept(Orange orange);
}
