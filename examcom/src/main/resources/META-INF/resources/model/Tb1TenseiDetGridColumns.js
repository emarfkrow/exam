/**
 * 転生明細グリッド定義
 */

let Tb1TenseiDetGridColumns = [];

$(function() {
    Tb1TenseiDetGridColumns = [
        Column.refer('TENSEI_ID', Messages['Tb1TenseiDetGrid.tenseiId'], 80, 'primaryKey numbering', 'TENSEI_MEI'),
        Column.comma('TENSEI_BN', Messages['Tb1TenseiDetGrid.tenseiBn'], 80, 'primaryKey numbering', null),
        Column.text('MEMO', Messages['Tb1TenseiDetGrid.memo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb1TenseiDetGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb1TenseiDetGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb1TenseiDetGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
