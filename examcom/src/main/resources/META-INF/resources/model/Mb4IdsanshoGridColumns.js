/**
 * ID参照マスタグリッド定義
 */

let Mb4IdsanshoGridColumns = [];

$(function() {
    Mb4IdsanshoGridColumns = [
        Column.text('IDREF_ID', Messages['Mb4IdsanshoGrid.idrefId'], 90, 'primaryKey numbering', null),
        Column.text('IDREF_MEI', Messages['Mb4IdsanshoGrid.idrefMei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Mb4IdsanshoGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
