/**
 * ID参照マスタグリッド定義
 */

let Mb4IdsanshoGridColumns = [];

$(function() {
    Mb4IdsanshoGridColumns = [
        Column.refer('IDSANSHO_ID', Messages['Mb4IdsanshoGrid.idsanshoId'], 90, 'primaryKey', 'IDSANSHO_MEI'),
        Column.text('IDSANSHO_MEI', Messages['Mb4IdsanshoGrid.idsanshoMei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Mb4IdsanshoGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
