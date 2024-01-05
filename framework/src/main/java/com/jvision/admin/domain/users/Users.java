package com.jvision.admin.domain.users;

import com.jvision.admin.domain.users.Role;
import com.jvision.admin.domain.users.Users;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Getter
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private String name;

    @Column(nullable = true)
    private String email;

    @Column
    private String picture;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Builder
    public Users(String name, String email, String picture, Role role)
    {
        this.name=(name != null) ? name : "";
        this.email= (email != null) ? email : "";
        this.picture=picture;
        this.role=role;
    }
    public Users update(String name, String picture)
    {
        this.name=name;
        this.picture=picture;
        return this;
    }
    public String getRoleKey()
    {
        return this.role.getKey();
    }

}
