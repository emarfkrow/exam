package com.example.form.model.base;

import java.util.List;
import java.util.Map;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb0EntitySRegistForm implements IForm {

    // /** logger */
    // private static final Logger LOG = LoggerFactory.getLogger(Tb0EntityRegistForm.class);

    /** エンティティ登録フォームのリスト */
    @Valid
    private List<Tb0EntityRegistForm> tb0EntityGrid;

    /**
     * @return エンティティ登録フォームのリスト
     */
    public List<Tb0EntityRegistForm> getTb0EntityGrid() {
        return tb0EntityGrid;
    }

    /**
     * @param p エンティティ登録フォームのリスト
     */
    public void setTb0EntityGrid(final List<Tb0EntityRegistForm> p) {
        this.tb0EntityGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        for (Tb0EntityRegistForm form : tb0EntityGrid) {
            if (form != null) {
                form.validate(errors, baseProcess);
            }
        }
    }

}
