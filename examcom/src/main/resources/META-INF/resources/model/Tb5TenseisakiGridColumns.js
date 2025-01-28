/**
 * 転生先グリッド定義
 */

let Tb5TenseisakiGridColumns = [];

$(function() {
    Tb5TenseisakiGridColumns = [
        Column.comma('TENSEISAKI_ID', Messages['Tb5TenseisakiGrid.tenseisakiId'], 80, 'primaryKey numbering', null),
        Column.cell('TENSEIMOTO_ID', Messages['Tb5TenseisakiGrid.tenseimotoId'], 80, 'notblank', null),
        Column.text('TENSEISAKI_INFO', Messages['Tb5TenseisakiGrid.tenseisakiInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb5TenseisakiGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb5TenseisakiGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb5TenseisakiGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
