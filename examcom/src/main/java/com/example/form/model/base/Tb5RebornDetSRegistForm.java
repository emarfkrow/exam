package com.example.form.model.base;

import java.util.List;
import java.util.Map;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生明細一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5RebornDetSRegistForm implements IForm {

    // /** logger */
    // private static final Logger LOG = LoggerFactory.getLogger(Tb5RebornDetRegistForm.class);

    /** 転生明細登録フォームのリスト */
    @Valid
    private List<Tb5RebornDetRegistForm> tb5RebornDetGrid;

    /**
     * @return 転生明細登録フォームのリスト
     */
    public List<Tb5RebornDetRegistForm> getTb5RebornDetGrid() {
        return tb5RebornDetGrid;
    }

    /**
     * @param p 転生明細登録フォームのリスト
     */
    public void setTb5RebornDetGrid(final List<Tb5RebornDetRegistForm> p) {
        this.tb5RebornDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        for (Tb5RebornDetRegistForm form : tb5RebornDetGrid) {
            if (form != null) {
                form.validate(errors, baseProcess);
            }
        }
    }

}
