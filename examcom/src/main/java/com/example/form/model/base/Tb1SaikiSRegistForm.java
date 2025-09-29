package com.example.form.model.base;

import java.util.List;
import java.util.Map;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 再帰一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1SaikiSRegistForm implements IForm {

    // /** logger */
    // private static final Logger LOG = LoggerFactory.getLogger(Tb1SaikiRegistForm.class);

    /** 再帰登録フォームのリスト */
    @Valid
    private List<Tb1SaikiRegistForm> tb1SaikiGrid;

    /**
     * @return 再帰登録フォームのリスト
     */
    public List<Tb1SaikiRegistForm> getTb1SaikiGrid() {
        return tb1SaikiGrid;
    }

    /**
     * @param p 再帰登録フォームのリスト
     */
    public void setTb1SaikiGrid(final List<Tb1SaikiRegistForm> p) {
        this.tb1SaikiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        for (Tb1SaikiRegistForm form : tb1SaikiGrid) {
            if (form != null) {
                form.validate(errors, baseProcess);
            }
        }
    }

}
