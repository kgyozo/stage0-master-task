package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if ( (firstSide > 0 && secondSide > 0 && thirdSide > 0)
            &&( (firstSide < secondSide + thirdSide)
            && (secondSide < firstSide + thirdSide)
            && (thirdSide < firstSide + secondSide)))
        {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }

}
