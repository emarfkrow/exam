package com.example.form.model.base;

import java.util.List;
import java.util.Map;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 末弟一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2YoungestSRegistForm implements IForm {

    // /** logger */
    // private static final Logger LOG = LoggerFactory.getLogger(Tb2YoungestRegistForm.class);

    /** 末弟登録フォームのリスト */
    @Valid
    private List<Tb2YoungestRegistForm> tb2YoungestGrid;

    /**
     * @return 末弟登録フォームのリスト
     */
    public List<Tb2YoungestRegistForm> getTb2YoungestGrid() {
        return tb2YoungestGrid;
    }

    /**
     * @param p 末弟登録フォームのリスト
     */
    public void setTb2YoungestGrid(final List<Tb2YoungestRegistForm> p) {
        this.tb2YoungestGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        for (Tb2YoungestRegistForm form : tb2YoungestGrid) {
            if (form != null) {
                form.validate(errors, baseProcess);
            }
        }
    }

}
