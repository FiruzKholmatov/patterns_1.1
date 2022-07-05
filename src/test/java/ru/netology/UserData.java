package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
@AllArgsConstructor


public class UserData {
    private  String city;
    private  String name;
    private  String phone;

}
