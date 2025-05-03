/**
 * IDBN参照マスタグリッド定義
 */

let Mb4IdbnGridColumns = [];

$(function() {
    Mb4IdbnGridColumns = [
        Column.refer('IDREF_ID', Messages['Mb4IdbnGrid.idrefId'], 90, 'primaryKey numbering', 'IDREF_MEI'),
        Column.text('IDBN_BN', Messages['Mb4IdbnGrid.idbnBn'], 90, 'primaryKey numbering', null),
        Column.text('IDBN_NO', Messages['Mb4IdbnGrid.idbnNo'], 90, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Mb4IdbnGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
