package com.example.form.model.base;

import java.util.List;
import java.util.Map;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 複合１一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1Combo1SRegistForm implements IForm {

    // /** logger */
    // private static final Logger LOG = LoggerFactory.getLogger(Tb1Combo1RegistForm.class);

    /** 複合１登録フォームのリスト */
    @Valid
    private List<Tb1Combo1RegistForm> tb1Combo1Grid;

    /**
     * @return 複合１登録フォームのリスト
     */
    public List<Tb1Combo1RegistForm> getTb1Combo1Grid() {
        return tb1Combo1Grid;
    }

    /**
     * @param p 複合１登録フォームのリスト
     */
    public void setTb1Combo1Grid(final List<Tb1Combo1RegistForm> p) {
        this.tb1Combo1Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        for (Tb1Combo1RegistForm form : tb1Combo1Grid) {
            if (form != null) {
                form.validate(errors, baseProcess);
            }
        }
    }

}
