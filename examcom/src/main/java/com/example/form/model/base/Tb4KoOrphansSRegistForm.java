package com.example.form.model.base;

import java.util.List;
import java.util.Map;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 孤児一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb4KoOrphansSRegistForm implements IForm {

    // /** logger */
    // private static final Logger LOG = LoggerFactory.getLogger(Tb4KoOrphansRegistForm.class);

    /** 孤児登録フォームのリスト */
    @Valid
    private List<Tb4KoOrphansRegistForm> tb4KoOrphansGrid;

    /**
     * @return 孤児登録フォームのリスト
     */
    public List<Tb4KoOrphansRegistForm> getTb4KoOrphansGrid() {
        return tb4KoOrphansGrid;
    }

    /**
     * @param p 孤児登録フォームのリスト
     */
    public void setTb4KoOrphansGrid(final List<Tb4KoOrphansRegistForm> p) {
        this.tb4KoOrphansGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        for (Tb4KoOrphansRegistForm form : tb4KoOrphansGrid) {
            if (form != null) {
                form.validate(errors, baseProcess);
            }
        }
    }

}
