package cydeo1.review;

import java.util.Arrays;

public class EnumTest {

    public static void main(String[] args) {
        User employeUser = new User("mikesmith","Mike","Smith",RoleEnum.EMPLOYE);

        System.out.println(employeUser.getRole());
        System.out.println(Arrays.toString(RoleEnum.values()));
    }

}
