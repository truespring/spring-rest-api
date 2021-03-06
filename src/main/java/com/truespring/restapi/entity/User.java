package com.truespring.restapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder // builder를 사용할 수 있게 함
@Entity // jpa entity임을 알림
@Getter
@NoArgsConstructor // 인자없는 생성자를 자동으로 생성
@AllArgsConstructor // 인자를 모두 갖춘 생성자를 자동으로 생성
@Table(name = "[user]")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long msrl;
    @Column(nullable = false, unique = true, length = 30)
    private String uid;
    @Column(nullable = false, length = 100)
    private String name;
}
