/**
 * 集約先グリッド定義
 */

let Tb6ShuyakuSakiGridColumns = [];

$(function() {
    Tb6ShuyakuSakiGridColumns = [
        Column.comma('SHUYAKU_SAKI_ID', Messages['Tb6ShuyakuSakiGrid.shuyakuSakiId'], 80, 'primaryKey numbering', null),
        Column.text('SHUYAKU_SAKI_INFO', Messages['Tb6ShuyakuSakiGrid.shuyakuSakiInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb6ShuyakuSakiGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb6ShuyakuSakiGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb6ShuyakuSakiGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
