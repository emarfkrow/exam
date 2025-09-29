package com.example.form.model.base;

import java.util.List;
import java.util.Map;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * ID参照マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1IdrefSRegistForm implements IForm {

    // /** logger */
    // private static final Logger LOG = LoggerFactory.getLogger(Tb1IdrefRegistForm.class);

    /** ID参照マスタ登録フォームのリスト */
    @Valid
    private List<Tb1IdrefRegistForm> tb1IdrefGrid;

    /**
     * @return ID参照マスタ登録フォームのリスト
     */
    public List<Tb1IdrefRegistForm> getTb1IdrefGrid() {
        return tb1IdrefGrid;
    }

    /**
     * @param p ID参照マスタ登録フォームのリスト
     */
    public void setTb1IdrefGrid(final List<Tb1IdrefRegistForm> p) {
        this.tb1IdrefGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        for (Tb1IdrefRegistForm form : tb1IdrefGrid) {
            if (form != null) {
                form.validate(errors, baseProcess);
            }
        }
    }

}
