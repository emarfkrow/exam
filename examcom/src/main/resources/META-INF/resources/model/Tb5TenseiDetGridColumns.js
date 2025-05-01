/**
 * 転生明細グリッド定義
 */

let Tb5TenseiDetGridColumns = [];

$(function() {
    Tb5TenseiDetGridColumns = [
        Column.text('TENSEI_ID', Messages['Tb5TenseiDetGrid.tenseiId'], 90, 'primaryKey numbering', null),
        Column.text('TENSEI_BN', Messages['Tb5TenseiDetGrid.tenseiBn'], 90, 'primaryKey numbering', null),
        Column.text('TENSEI_DET_INFO', Messages['Tb5TenseiDetGrid.tenseiDetInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb5TenseiDetGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
