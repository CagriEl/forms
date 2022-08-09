package com.casestudy.demo.repository;

import java.util.Collection;
import com.casestudy.demo.model.Form;

public interface FormRepository {
    Collection<Form> findAll();
    Form create(Form form);
}
