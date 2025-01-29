/**
 * ID参照マスタグリッド定義
 */

let Mb4IdsanshoGridColumns = [];

$(function() {
    Mb4IdsanshoGridColumns = [
        Column.refer('IDSANSHO_ID', Messages['Mb4IdsanshoGrid.idsanshoId'], 80, 'primaryKey numbering', 'IDSANSHO_MEI'),
        Column.text('IDSANSHO_MEI', Messages['Mb4IdsanshoGrid.idsanshoMei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Mb4IdsanshoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Mb4IdsanshoGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Mb4IdsanshoGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
