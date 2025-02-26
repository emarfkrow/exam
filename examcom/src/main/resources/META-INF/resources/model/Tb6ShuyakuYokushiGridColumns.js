/**
 * 集約抑止グリッド定義
 */

let Tb6ShuyakuYokushiGridColumns = [];

$(function() {
    Tb6ShuyakuYokushiGridColumns = [
        Column.text('SHUYAKU_YOKUSHI_ID', Messages['Tb6ShuyakuYokushiGrid.shuyakuYokushiId'], 80, 'primaryKey numbering', null),
        Column.text('SHUYAKU_YOKUSHI_INFO', Messages['Tb6ShuyakuYokushiGrid.shuyakuYokushiInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb6ShuyakuYokushiGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb6ShuyakuYokushiGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb6ShuyakuYokushiGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
