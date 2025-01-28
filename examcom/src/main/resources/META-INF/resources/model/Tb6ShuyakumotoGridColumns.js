/**
 * 集約元グリッド定義
 */

let Tb6ShuyakumotoGridColumns = [];

$(function() {
    Tb6ShuyakumotoGridColumns = [
        Column.comma('SHUYAKUMOTO_ID', Messages['Tb6ShuyakumotoGrid.shuyakumotoId'], 80, 'primaryKey numbering', null),
        Column.comma('SHUYAKUSAKI_ID', Messages['Tb6ShuyakumotoGrid.shuyakusakiId'], 80, '', null),
        Column.text('SHUYAKUMOTO_INFO', Messages['Tb6ShuyakumotoGrid.shuyakumotoInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb6ShuyakumotoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb6ShuyakumotoGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb6ShuyakumotoGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
