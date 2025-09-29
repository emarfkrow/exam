package com.example.form.model.base;

import java.util.List;
import java.util.Map;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 参照３マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1Refer3SRegistForm implements IForm {

    // /** logger */
    // private static final Logger LOG = LoggerFactory.getLogger(Tb1Refer3RegistForm.class);

    /** 参照３マスタ登録フォームのリスト */
    @Valid
    private List<Tb1Refer3RegistForm> tb1Refer3Grid;

    /**
     * @return 参照３マスタ登録フォームのリスト
     */
    public List<Tb1Refer3RegistForm> getTb1Refer3Grid() {
        return tb1Refer3Grid;
    }

    /**
     * @param p 参照３マスタ登録フォームのリスト
     */
    public void setTb1Refer3Grid(final List<Tb1Refer3RegistForm> p) {
        this.tb1Refer3Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        for (Tb1Refer3RegistForm form : tb1Refer3Grid) {
            if (form != null) {
                form.validate(errors, baseProcess);
            }
        }
    }

}
