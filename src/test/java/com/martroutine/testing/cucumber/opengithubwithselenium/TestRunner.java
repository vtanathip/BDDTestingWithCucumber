package com.martroutine.testing.cucumber.opengithubwithselenium;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format={"pretty", "html:target/cucumber/opengithub"})
public class TestRunner {
}