/**
 * 転生先グリッド定義
 */

let Tb5TenseiSakiGridColumns = [];

$(function() {
    Tb5TenseiSakiGridColumns = [
        Column.comma('TENSEI_SAKI_ID', Messages['Tb5TenseiSakiGrid.tenseiSakiId'], 80, 'primaryKey numbering', null),
        Column.text('TENSEI_SAKI_INFO', Messages['Tb5TenseiSakiGrid.tenseiSakiInfo'], 300, '', null),
        Column.cell('TENSEI_MOTO_ID', Messages['Tb5TenseiSakiGrid.tenseiMotoId'], 80, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb5TenseiSakiGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb5TenseiSakiGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb5TenseiSakiGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
