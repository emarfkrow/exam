package com.example.form.model.base;

import java.util.List;
import java.util.Map;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 起源一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6OrgSRegistForm implements IForm {

    // /** logger */
    // private static final Logger LOG = LoggerFactory.getLogger(Tb6OrgRegistForm.class);

    /** 起源登録フォームのリスト */
    @Valid
    private List<Tb6OrgRegistForm> tb6OrgGrid;

    /**
     * @return 起源登録フォームのリスト
     */
    public List<Tb6OrgRegistForm> getTb6OrgGrid() {
        return tb6OrgGrid;
    }

    /**
     * @param p 起源登録フォームのリスト
     */
    public void setTb6OrgGrid(final List<Tb6OrgRegistForm> p) {
        this.tb6OrgGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        for (Tb6OrgRegistForm form : tb6OrgGrid) {
            if (form != null) {
                form.validate(errors, baseProcess);
            }
        }
    }

}
