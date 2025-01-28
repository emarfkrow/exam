/**
 * 集約先グリッド定義
 */

let Tb6ShuyakusakiGridColumns = [];

$(function() {
    Tb6ShuyakusakiGridColumns = [
        Column.comma('SHUYAKUSAKI_ID', Messages['Tb6ShuyakusakiGrid.shuyakusakiId'], 80, 'primaryKey numbering', null),
        Column.text('SHUYAKUSAKI_INFO', Messages['Tb6ShuyakusakiGrid.shuyakusakiInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb6ShuyakusakiGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb6ShuyakusakiGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb6ShuyakusakiGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
