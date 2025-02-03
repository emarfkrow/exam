/**
 * 転生抑止先２グリッド定義
 */

let Tb5Tenseiyokushisaki2GridColumns = [];

$(function() {
    Tb5Tenseiyokushisaki2GridColumns = [
        Column.comma('TENSEIYOKUSHISAKI2_ID', Messages['Tb5Tenseiyokushisaki2Grid.tenseiyokushisaki2Id'], 80, 'primaryKey numbering', null),
        Column.comma('TENSEIYOKUSHI_ID', Messages['Tb5Tenseiyokushisaki2Grid.tenseiyokushiId'], 80, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb5Tenseiyokushisaki2Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb5Tenseiyokushisaki2Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb5Tenseiyokushisaki2Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
