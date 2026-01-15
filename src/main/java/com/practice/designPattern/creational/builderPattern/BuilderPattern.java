package com.practice.designPattern.creational.builderPattern;

public class BuilderPattern {

    private String name;
    private Boolean display = false;

    private BuilderPattern(BuilderPatterBuilder builder) {
        this.name = builder.name;
        this.display = builder.display;
    }

    @Override
    public String toString() {
        return "BuilderPattern{" +
                "name='" + name + '\'' +
                ", display=" + display +
                '}';
    }

    public static class BuilderPatterBuilder {
        private String name;
        private Boolean display = false;

        public BuilderPatterBuilder(String name) {
            this.name = name;
        }

        public BuilderPatterBuilder canDisplayName(boolean display){
            this.display = display;
            return this;
        }

        public BuilderPattern build(){
            return new BuilderPattern(this);
        }

    }

}
