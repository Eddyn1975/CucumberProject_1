$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/Skybluebackground.feature");
formatter.feature({
  "line": 1,
  "name": "Sky Blue Background",
  "description": "",
  "id": "sky-blue-background",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6017066982,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "As a user I want to display the background color  so that it can change to sky blue",
  "description": "",
  "id": "sky-blue-background;as-a-user-i-want-to-display-the-background-color--so-that-it-can-change-to-sky-blue",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "\"Set SkyBlue Background\" button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyBlue Background",
      "offset": 1
    }
  ],
  "location": "SkybluebackgroundSteps.button_exists(String)"
});
formatter.result({
  "duration": 256700360,
  "status": "passed"
});
formatter.match({
  "location": "SkybluebackgroundSteps.i_click_on_the_button()"
});
formatter.result({
  "duration": 122638683,
  "status": "passed"
});
formatter.match({
  "location": "SkybluebackgroundSteps.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 89479467,
  "status": "passed"
});
});