/**
 * 転生先グリッド定義
 */

let Tb5TenseiSakiGridColumns = [];

$(function() {
    Tb5TenseiSakiGridColumns = [
        Column.text('TENSEI_SAKI_ID', Messages['Tb5TenseiSakiGrid.tenseiSakiId'], 90, 'primaryKey numbering', null),
        Column.text('TENSEI_SAKI_INFO', Messages['Tb5TenseiSakiGrid.tenseiSakiInfo'], 300, '', null),
        Column.cell('TENSEI_MOTO_ID', Messages['Tb5TenseiSakiGrid.tenseiMotoId'], 90, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb5TenseiSakiGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
