/**
 * ID-BNマスタグリッド定義
 */

let Tb4IdbnGridColumns = [];

$(function() {
    Tb4IdbnGridColumns = [
        Column.text('REF_ID', Messages['Tb4IdbnGrid.refId'], 90, 'primaryKey numbering', null),
        Column.text('REF_BN', Messages['Tb4IdbnGrid.refBn'], 90, 'primaryKey numbering', null),
        Column.text('IDBN_NO', Messages['Tb4IdbnGrid.idbnNo'], 90, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb4IdbnGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
