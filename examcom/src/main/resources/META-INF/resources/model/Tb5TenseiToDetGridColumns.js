/**
 * 転生先明細グリッド定義
 */

let Tb5TenseiToDetGridColumns = [];

$(function() {
    Tb5TenseiToDetGridColumns = [
        Column.text('TENSEI_TO_ID', Messages['Tb5TenseiToDetGrid.tenseiToId'], 90, 'primaryKey numbering', null),
        Column.text('TENSEI_TO_BN', Messages['Tb5TenseiToDetGrid.tenseiToBn'], 90, 'primaryKey numbering', null),
        Column.text('TENSEI_DET_INFO', Messages['Tb5TenseiToDetGrid.tenseiDetInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb5TenseiToDetGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
