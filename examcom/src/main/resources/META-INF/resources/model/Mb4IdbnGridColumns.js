/**
 * ID-BNマスタグリッド定義
 */

let Mb4IdbnGridColumns = [];

$(function() {
    Mb4IdbnGridColumns = [
        Column.text('REF_ID', Messages['Mb4IdbnGrid.refId'], 90, 'primaryKey numbering', null),
        Column.text('REF_BN', Messages['Mb4IdbnGrid.refBn'], 90, 'primaryKey numbering', null),
        Column.text('IDBN_NO', Messages['Mb4IdbnGrid.idbnNo'], 90, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Mb4IdbnGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
