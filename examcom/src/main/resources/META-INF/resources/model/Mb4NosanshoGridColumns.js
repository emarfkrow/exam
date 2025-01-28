/**
 * NO参照マスタグリッド定義
 */

let Mb4NosanshoGridColumns = [];

$(function() {
    Mb4NosanshoGridColumns = [
        Column.text('NOSANSHO_NO', Messages['Mb4NosanshoGrid.nosanshoNo'], 80, 'primaryKey', null),
        Column.text('NOSANSHO_MEI', Messages['Mb4NosanshoGrid.nosanshoMei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Mb4NosanshoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Mb4NosanshoGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Mb4NosanshoGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
