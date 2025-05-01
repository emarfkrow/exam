package com.example.form.model;

import java.util.Map;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.util.Messages;

/**
 * エンティティ検証拡張
 * @author toshiyuki
 *
 */
public class TEntity1RegistForm extends com.example.form.model.base.Tb4SanshoMotoRegistForm {

    /**
     *
     */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess p) {

        p.masterCheck(errors, "MSansho1Search", "sansho1Id", this.getIdrefId(), Messages.get("TEntity1.IdrefId"));
    }

}
