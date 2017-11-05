package com.gsq.shiroweb.dao;

import com.gsq.shiroweb.entity.Role;

import java.util.List;

public interface RoleDao {

    Role createRole(Role role);
    Role updateRole(Role role);
    void deleteRole(Long roleId);

    Role findOne(Long roleId);
    List<Role> findAll();

}
