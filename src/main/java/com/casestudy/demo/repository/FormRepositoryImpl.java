package com.casestudy.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.casestudy.demo.model.Form;

@Repository
public class FormRepositoryImpl implements FormRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Form> findAll() {
        return jdbcTemplate.query("SELECT * FROM form_record", new BeanPropertyRowMapper<Form>(Form.class));
    }

    @Override
    public Form create(Form form) {
        jdbcTemplate.update("INSERT INTO form_record(ad_soyad,mersis_no,adres,telefon,e_posta,dogum_tarihi,perakende_ticareti,tercih_sebebi,il_ilce_tercih,yatirim_miktari,eklemek_istenilenler) VALUES(?,?,?,?,?,?,?,?,?,?,?)", form.getAd_soyad(), form.getMersis_no(), form.getAdres(), form.getTelefon(), form.getE_posta(), form.getDogum_tarihi(), form.getPerakende_ticareti(), form.getTercih_sebebi(), form.getIl_ilce_tercih(), form.getYatirim_miktari(), form.getEklemek_istenilenler());
        return form;
    }
}
