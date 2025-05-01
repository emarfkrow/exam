/**
 * NO参照マスタグリッド定義
 */

let Mb4NosanshoGridColumns = [];

$(function() {
    Mb4NosanshoGridColumns = [
        Column.text('NOREF_NO', Messages['Mb4NosanshoGrid.norefNo'], 90, 'primaryKey', null),
        Column.text('NOREF_MEI', Messages['Mb4NosanshoGrid.norefMei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Mb4NosanshoGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
