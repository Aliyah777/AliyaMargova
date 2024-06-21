package demoQA.winer24.drivers.enums;

import demoQA.winer24.drivers.pages.PracticeFormPage;
import lombok.Getter;

public enum Endpoints {
    ALERTS ("alerts");
//    PracticeFormPage ("alerts");
//    ("automation-practice-form");

    @Getter
    String endpoint;

    Endpoints(String endpoint){
        this.endpoint = endpoint;
        }


}
