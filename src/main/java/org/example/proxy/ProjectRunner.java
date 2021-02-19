package org.example.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/Raychenko88/FactoryMethod");

        project.run();
    }
}
