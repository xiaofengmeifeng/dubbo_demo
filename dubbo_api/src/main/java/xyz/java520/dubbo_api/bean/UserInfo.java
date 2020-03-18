package xyz.java520.dubbo_api.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo implements Serializable {

    private Integer id;

    private String name;

    private Integer age;

}
