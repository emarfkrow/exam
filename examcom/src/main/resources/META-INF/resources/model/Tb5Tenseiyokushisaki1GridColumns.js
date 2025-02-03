/**
 * 転生抑止先１グリッド定義
 */

let Tb5Tenseiyokushisaki1GridColumns = [];

$(function() {
    Tb5Tenseiyokushisaki1GridColumns = [
        Column.comma('TENSEIYOKUSHISAKI1_ID', Messages['Tb5Tenseiyokushisaki1Grid.tenseiyokushisaki1Id'], 80, 'primaryKey numbering', null),
        Column.cell('TENSEIYOKUSHI_ID', Messages['Tb5Tenseiyokushisaki1Grid.tenseiyokushiId'], 80, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb5Tenseiyokushisaki1Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb5Tenseiyokushisaki1Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb5Tenseiyokushisaki1Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
