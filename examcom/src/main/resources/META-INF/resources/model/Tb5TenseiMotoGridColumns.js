/**
 * 転生元グリッド定義
 */

let Tb5TenseiMotoGridColumns = [];

$(function() {
    Tb5TenseiMotoGridColumns = [
        Column.text('TENSEI_MOTO_ID', Messages['Tb5TenseiMotoGrid.tenseiMotoId'], 80, 'primaryKey numbering', null),
        Column.text('TENSEI_MOTO_INFO', Messages['Tb5TenseiMotoGrid.tenseiMotoInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb5TenseiMotoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb5TenseiMotoGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb5TenseiMotoGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
